package fr.spacefox.perftests.quarkus.data.entity359;

import fr.spacefox.perftests.quarkus.core.port.data.Entity359DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service359.model.Model359;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity359Repository implements Entity359DatasourcePort, PanacheRepository<Entity359> {
    @Override
    public Optional<Model359> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
