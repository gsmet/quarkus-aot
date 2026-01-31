package fr.spacefox.perftests.quarkus.data.entity852;

import fr.spacefox.perftests.quarkus.core.port.data.Entity852DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service852.model.Model852;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity852Repository implements Entity852DatasourcePort, PanacheRepository<Entity852> {
    @Override
    public Optional<Model852> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
