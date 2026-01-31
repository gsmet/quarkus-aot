package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service236.model.Model236;
import java.util.Optional;

public interface Entity236DatasourcePort {
    Optional<Model236> find(Long id);
}
