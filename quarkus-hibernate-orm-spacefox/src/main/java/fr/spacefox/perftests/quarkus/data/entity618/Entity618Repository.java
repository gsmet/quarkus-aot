package fr.spacefox.perftests.quarkus.data.entity618;

import fr.spacefox.perftests.quarkus.core.port.data.Entity618DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service618.model.Model618;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity618Repository implements Entity618DatasourcePort, PanacheRepository<Entity618> {
    @Override
    public Optional<Model618> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
