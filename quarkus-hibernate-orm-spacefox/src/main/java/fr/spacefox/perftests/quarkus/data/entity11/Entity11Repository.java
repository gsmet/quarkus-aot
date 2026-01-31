package fr.spacefox.perftests.quarkus.data.entity11;

import fr.spacefox.perftests.quarkus.core.port.data.Entity11DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service11.model.Model11;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity11Repository implements Entity11DatasourcePort, PanacheRepository<Entity11> {
    @Override
    public Optional<Model11> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
