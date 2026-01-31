package fr.spacefox.perftests.quarkus.data.entity289;

import fr.spacefox.perftests.quarkus.core.port.data.Entity289DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service289.model.Model289;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity289Repository implements Entity289DatasourcePort, PanacheRepository<Entity289> {
    @Override
    public Optional<Model289> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
