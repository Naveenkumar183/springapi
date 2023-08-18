import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springrest.springrest.entities.PlayerStatistics;

import java.util.List;

@Repository
public interface PlayerStatisticsDao extends JpaRepository<PlayerStatistics, Long> {

    @Query("SELECT ps FROM PlayerStatistics ps " +
           "WHERE (:minGamesPlayed IS NULL OR ps.gamesPlayed >= :minGamesPlayed) " +
           "AND (:minMinutesPlayed IS NULL OR ps.minutesPlayed >= :minMinutesPlayed) " +
           "AND (:minGoalsScored IS NULL OR ps.goalsScored >= :minGoalsScored) " +
           "AND (:birthYear IS NULL OR ps.birthYear = :birthYear)")
    List<PlayerStatistics> findByFilter(Integer minGamesPlayed,
                                         Integer minMinutesPlayed,
                                         Integer minGoalsScored,
                                         Integer birthYear);
}



