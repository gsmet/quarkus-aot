package fr.spacefox.perftests.quarkus.data.entity849;

import fr.spacefox.perftests.quarkus.core.port.data.Entity849DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service849.model.Model849;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity849Repository implements Entity849DatasourcePort, PanacheRepository<Entity849> {
    @Override
    public Optional<Model849> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
