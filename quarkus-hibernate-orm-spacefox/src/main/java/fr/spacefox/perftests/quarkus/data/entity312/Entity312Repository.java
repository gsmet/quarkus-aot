package fr.spacefox.perftests.quarkus.data.entity312;

import fr.spacefox.perftests.quarkus.core.port.data.Entity312DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service312.model.Model312;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity312Repository implements Entity312DatasourcePort, PanacheRepository<Entity312> {
    @Override
    public Optional<Model312> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
