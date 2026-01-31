package fr.spacefox.perftests.quarkus.core.service690;

import fr.spacefox.perftests.quarkus.core.port.data.Entity690DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service690.model.Model690;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service690 {

    private final Entity690DatasourcePort datasource;

    public Service690(Entity690DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model690 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
