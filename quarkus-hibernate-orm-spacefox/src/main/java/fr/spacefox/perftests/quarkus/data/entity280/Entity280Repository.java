package fr.spacefox.perftests.quarkus.data.entity280;

import fr.spacefox.perftests.quarkus.core.port.data.Entity280DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service280.model.Model280;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity280Repository implements Entity280DatasourcePort, PanacheRepository<Entity280> {
    @Override
    public Optional<Model280> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
