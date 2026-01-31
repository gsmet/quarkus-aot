package fr.spacefox.perftests.quarkus.data.entity329;

import fr.spacefox.perftests.quarkus.core.port.data.Entity329DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service329.model.Model329;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity329Repository implements Entity329DatasourcePort, PanacheRepository<Entity329> {
    @Override
    public Optional<Model329> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
