package fr.spacefox.perftests.quarkus.data.entity481;

import fr.spacefox.perftests.quarkus.core.port.data.Entity481DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service481.model.Model481;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity481Repository implements Entity481DatasourcePort, PanacheRepository<Entity481> {
    @Override
    public Optional<Model481> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
