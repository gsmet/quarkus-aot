package fr.spacefox.perftests.quarkus.data.entity565;

import fr.spacefox.perftests.quarkus.core.port.data.Entity565DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service565.model.Model565;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity565Repository implements Entity565DatasourcePort, PanacheRepository<Entity565> {
    @Override
    public Optional<Model565> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
