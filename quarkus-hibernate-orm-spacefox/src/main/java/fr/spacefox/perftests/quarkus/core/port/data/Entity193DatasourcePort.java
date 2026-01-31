package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service193.model.Model193;
import java.util.Optional;

public interface Entity193DatasourcePort {
    Optional<Model193> find(Long id);
}
