package fr.spacefox.perftests.quarkus.data.entity914;

import fr.spacefox.perftests.quarkus.core.port.data.Entity914DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service914.model.Model914;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity914Repository implements Entity914DatasourcePort, PanacheRepository<Entity914> {
    @Override
    public Optional<Model914> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
