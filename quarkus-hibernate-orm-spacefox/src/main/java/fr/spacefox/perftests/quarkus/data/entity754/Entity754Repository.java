package fr.spacefox.perftests.quarkus.data.entity754;

import fr.spacefox.perftests.quarkus.core.port.data.Entity754DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service754.model.Model754;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity754Repository implements Entity754DatasourcePort, PanacheRepository<Entity754> {
    @Override
    public Optional<Model754> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
