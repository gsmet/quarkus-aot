package fr.spacefox.perftests.quarkus.data.entity717;

import fr.spacefox.perftests.quarkus.core.port.data.Entity717DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service717.model.Model717;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity717Repository implements Entity717DatasourcePort, PanacheRepository<Entity717> {
    @Override
    public Optional<Model717> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
