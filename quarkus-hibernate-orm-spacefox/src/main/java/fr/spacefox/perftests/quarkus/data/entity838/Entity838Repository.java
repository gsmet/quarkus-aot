package fr.spacefox.perftests.quarkus.data.entity838;

import fr.spacefox.perftests.quarkus.core.port.data.Entity838DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service838.model.Model838;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity838Repository implements Entity838DatasourcePort, PanacheRepository<Entity838> {
    @Override
    public Optional<Model838> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
