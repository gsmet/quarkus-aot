package fr.spacefox.perftests.quarkus.data.entity637;

import fr.spacefox.perftests.quarkus.core.port.data.Entity637DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service637.model.Model637;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity637Repository implements Entity637DatasourcePort, PanacheRepository<Entity637> {
    @Override
    public Optional<Model637> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
