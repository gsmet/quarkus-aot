package fr.spacefox.perftests.quarkus.data.entity527;

import fr.spacefox.perftests.quarkus.core.port.data.Entity527DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service527.model.Model527;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity527Repository implements Entity527DatasourcePort, PanacheRepository<Entity527> {
    @Override
    public Optional<Model527> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
