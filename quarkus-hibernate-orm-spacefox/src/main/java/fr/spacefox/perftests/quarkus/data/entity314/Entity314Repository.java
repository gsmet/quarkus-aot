package fr.spacefox.perftests.quarkus.data.entity314;

import fr.spacefox.perftests.quarkus.core.port.data.Entity314DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service314.model.Model314;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity314Repository implements Entity314DatasourcePort, PanacheRepository<Entity314> {
    @Override
    public Optional<Model314> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
