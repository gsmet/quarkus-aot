package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service673.model.Model673;
import java.util.Optional;

public interface Entity673DatasourcePort {
    Optional<Model673> find(Long id);
}
