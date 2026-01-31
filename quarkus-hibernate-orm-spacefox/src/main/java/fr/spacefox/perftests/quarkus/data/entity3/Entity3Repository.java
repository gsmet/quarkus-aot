package fr.spacefox.perftests.quarkus.data.entity3;

import fr.spacefox.perftests.quarkus.core.port.data.Entity3DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service3.model.Model3;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity3Repository implements Entity3DatasourcePort, PanacheRepository<Entity3> {
    @Override
    public Optional<Model3> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
