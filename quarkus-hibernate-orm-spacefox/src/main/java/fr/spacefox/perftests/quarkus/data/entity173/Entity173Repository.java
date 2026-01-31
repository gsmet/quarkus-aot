package fr.spacefox.perftests.quarkus.data.entity173;

import fr.spacefox.perftests.quarkus.core.port.data.Entity173DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service173.model.Model173;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity173Repository implements Entity173DatasourcePort, PanacheRepository<Entity173> {
    @Override
    public Optional<Model173> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
