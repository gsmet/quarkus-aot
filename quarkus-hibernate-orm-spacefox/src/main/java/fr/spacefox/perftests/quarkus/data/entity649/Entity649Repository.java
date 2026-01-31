package fr.spacefox.perftests.quarkus.data.entity649;

import fr.spacefox.perftests.quarkus.core.port.data.Entity649DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service649.model.Model649;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity649Repository implements Entity649DatasourcePort, PanacheRepository<Entity649> {
    @Override
    public Optional<Model649> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
