package fr.spacefox.perftests.quarkus.data.entity401;

import fr.spacefox.perftests.quarkus.core.port.data.Entity401DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service401.model.Model401;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity401Repository implements Entity401DatasourcePort, PanacheRepository<Entity401> {
    @Override
    public Optional<Model401> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
