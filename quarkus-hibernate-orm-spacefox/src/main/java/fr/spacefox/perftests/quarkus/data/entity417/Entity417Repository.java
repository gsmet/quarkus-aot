package fr.spacefox.perftests.quarkus.data.entity417;

import fr.spacefox.perftests.quarkus.core.port.data.Entity417DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service417.model.Model417;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity417Repository implements Entity417DatasourcePort, PanacheRepository<Entity417> {
    @Override
    public Optional<Model417> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
