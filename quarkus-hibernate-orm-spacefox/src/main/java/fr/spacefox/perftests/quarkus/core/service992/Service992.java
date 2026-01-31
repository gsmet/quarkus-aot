package fr.spacefox.perftests.quarkus.core.service992;

import fr.spacefox.perftests.quarkus.core.port.data.Entity992DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service992.model.Model992;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service992 {

    private final Entity992DatasourcePort datasource;

    public Service992(Entity992DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model992 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
