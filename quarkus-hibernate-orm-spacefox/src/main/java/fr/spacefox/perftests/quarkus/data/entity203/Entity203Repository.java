package fr.spacefox.perftests.quarkus.data.entity203;

import fr.spacefox.perftests.quarkus.core.port.data.Entity203DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service203.model.Model203;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity203Repository implements Entity203DatasourcePort, PanacheRepository<Entity203> {
    @Override
    public Optional<Model203> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
