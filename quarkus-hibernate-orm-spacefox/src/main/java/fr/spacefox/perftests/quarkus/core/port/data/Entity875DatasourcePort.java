package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service875.model.Model875;
import java.util.Optional;

public interface Entity875DatasourcePort {
    Optional<Model875> find(Long id);
}
