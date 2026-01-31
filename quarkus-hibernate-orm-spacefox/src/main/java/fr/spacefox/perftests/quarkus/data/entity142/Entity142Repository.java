package fr.spacefox.perftests.quarkus.data.entity142;

import fr.spacefox.perftests.quarkus.core.port.data.Entity142DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service142.model.Model142;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity142Repository implements Entity142DatasourcePort, PanacheRepository<Entity142> {
    @Override
    public Optional<Model142> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
