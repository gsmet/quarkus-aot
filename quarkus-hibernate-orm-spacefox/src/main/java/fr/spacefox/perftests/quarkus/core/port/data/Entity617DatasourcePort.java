package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service617.model.Model617;
import java.util.Optional;

public interface Entity617DatasourcePort {
    Optional<Model617> find(Long id);
}
