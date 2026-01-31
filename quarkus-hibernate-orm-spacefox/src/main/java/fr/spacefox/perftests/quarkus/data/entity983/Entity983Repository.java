package fr.spacefox.perftests.quarkus.data.entity983;

import fr.spacefox.perftests.quarkus.core.port.data.Entity983DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service983.model.Model983;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity983Repository implements Entity983DatasourcePort, PanacheRepository<Entity983> {
    @Override
    public Optional<Model983> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
