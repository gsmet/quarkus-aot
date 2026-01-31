package fr.spacefox.perftests.quarkus.core.service562;

import fr.spacefox.perftests.quarkus.core.port.data.Entity562DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service562.model.Model562;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service562 {

    private final Entity562DatasourcePort datasource;

    public Service562(Entity562DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model562 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
