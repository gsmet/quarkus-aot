package fr.spacefox.perftests.quarkus.data.entity115;

import fr.spacefox.perftests.quarkus.core.port.data.Entity115DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service115.model.Model115;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity115Repository implements Entity115DatasourcePort, PanacheRepository<Entity115> {
    @Override
    public Optional<Model115> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
