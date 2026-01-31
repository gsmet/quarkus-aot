package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service612.model.Model612;
import java.util.Optional;

public interface Entity612DatasourcePort {
    Optional<Model612> find(Long id);
}
