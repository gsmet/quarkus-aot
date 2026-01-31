package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service314.model.Model314;
import java.util.Optional;

public interface Entity314DatasourcePort {
    Optional<Model314> find(Long id);
}
