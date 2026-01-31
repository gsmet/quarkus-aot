package fr.spacefox.perftests.quarkus.data.entity492;

import fr.spacefox.perftests.quarkus.core.port.data.Entity492DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service492.model.Model492;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity492Repository implements Entity492DatasourcePort, PanacheRepository<Entity492> {
    @Override
    public Optional<Model492> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
