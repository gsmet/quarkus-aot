package fr.spacefox.perftests.quarkus.data.entity255;

import fr.spacefox.perftests.quarkus.core.port.data.Entity255DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service255.model.Model255;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity255Repository implements Entity255DatasourcePort, PanacheRepository<Entity255> {
    @Override
    public Optional<Model255> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
