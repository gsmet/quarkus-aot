package fr.spacefox.perftests.quarkus.core.service892;

import fr.spacefox.perftests.quarkus.core.port.data.Entity892DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service892.model.Model892;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service892 {

    private final Entity892DatasourcePort datasource;

    public Service892(Entity892DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model892 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
