package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service824.model.Model824;
import java.util.Optional;

public interface Entity824DatasourcePort {
    Optional<Model824> find(Long id);
}
