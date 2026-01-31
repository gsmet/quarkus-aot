package fr.spacefox.perftests.quarkus.data.entity232;

import fr.spacefox.perftests.quarkus.core.port.data.Entity232DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service232.model.Model232;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity232Repository implements Entity232DatasourcePort, PanacheRepository<Entity232> {
    @Override
    public Optional<Model232> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
