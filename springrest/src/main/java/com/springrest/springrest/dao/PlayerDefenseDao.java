import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springrest.springrest.entities.PlayerDefenseData;

import java.util.List;

@Repository
public interface PlayerDefenseDao extends JpaRepository<PlayerDefenseData, Long> {

    @Query("SELECT pd FROM PlayerDefenseData pd " +
           "WHERE (:position IS NULL OR pd.position = :position) " +
           "AND (:team IS NULL OR pd.team = :team) " +
           "AND (:minTackles IS NULL OR pd.tackles >= :minTackles) " +
           "AND (:minTacklesWon IS NULL OR pd.tacklesWon >= :minTacklesWon)")
    List<PlayerDefenseData> findByFilter(String position,
                                          String team,
                                          Integer minTackles,
                                          Integer minTacklesWon);
}
