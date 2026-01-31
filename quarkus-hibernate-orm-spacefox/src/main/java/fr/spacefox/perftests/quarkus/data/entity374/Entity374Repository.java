package fr.spacefox.perftests.quarkus.data.entity374;

import fr.spacefox.perftests.quarkus.core.port.data.Entity374DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service374.model.Model374;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity374Repository implements Entity374DatasourcePort, PanacheRepository<Entity374> {
    @Override
    public Optional<Model374> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
