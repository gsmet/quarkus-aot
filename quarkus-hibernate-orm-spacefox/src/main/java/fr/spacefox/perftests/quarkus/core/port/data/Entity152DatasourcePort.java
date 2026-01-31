package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service152.model.Model152;
import java.util.Optional;

public interface Entity152DatasourcePort {
    Optional<Model152> find(Long id);
}
