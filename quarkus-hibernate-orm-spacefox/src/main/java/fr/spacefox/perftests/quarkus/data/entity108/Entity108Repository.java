package fr.spacefox.perftests.quarkus.data.entity108;

import fr.spacefox.perftests.quarkus.core.port.data.Entity108DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service108.model.Model108;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity108Repository implements Entity108DatasourcePort, PanacheRepository<Entity108> {
    @Override
    public Optional<Model108> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
