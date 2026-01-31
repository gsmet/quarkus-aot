package fr.spacefox.perftests.quarkus.data.entity803;

import fr.spacefox.perftests.quarkus.core.port.data.Entity803DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service803.model.Model803;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity803Repository implements Entity803DatasourcePort, PanacheRepository<Entity803> {
    @Override
    public Optional<Model803> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
