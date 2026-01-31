package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service714.model.Model714;
import java.util.Optional;

public interface Entity714DatasourcePort {
    Optional<Model714> find(Long id);
}
