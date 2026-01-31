package fr.spacefox.perftests.quarkus.data.entity204;

import fr.spacefox.perftests.quarkus.core.port.data.Entity204DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service204.model.Model204;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity204Repository implements Entity204DatasourcePort, PanacheRepository<Entity204> {
    @Override
    public Optional<Model204> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
