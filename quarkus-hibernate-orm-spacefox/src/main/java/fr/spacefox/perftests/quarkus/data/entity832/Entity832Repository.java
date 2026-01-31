package fr.spacefox.perftests.quarkus.data.entity832;

import fr.spacefox.perftests.quarkus.core.port.data.Entity832DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service832.model.Model832;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity832Repository implements Entity832DatasourcePort, PanacheRepository<Entity832> {
    @Override
    public Optional<Model832> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
