package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service2.model.Model2;
import java.util.Optional;

public interface Entity2DatasourcePort {
    Optional<Model2> find(Long id);
}
