package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service371.model.Model371;
import java.util.Optional;

public interface Entity371DatasourcePort {
    Optional<Model371> find(Long id);
}
