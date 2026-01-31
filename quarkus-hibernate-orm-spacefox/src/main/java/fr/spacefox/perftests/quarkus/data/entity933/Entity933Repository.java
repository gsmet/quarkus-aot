package fr.spacefox.perftests.quarkus.data.entity933;

import fr.spacefox.perftests.quarkus.core.port.data.Entity933DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service933.model.Model933;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity933Repository implements Entity933DatasourcePort, PanacheRepository<Entity933> {
    @Override
    public Optional<Model933> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
