package fr.spacefox.perftests.quarkus.data.entity341;

import fr.spacefox.perftests.quarkus.core.port.data.Entity341DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service341.model.Model341;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity341Repository implements Entity341DatasourcePort, PanacheRepository<Entity341> {
    @Override
    public Optional<Model341> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
